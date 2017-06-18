package com.thom.api;

import com.github.pagehelper.PageHelper;
import com.thom.dto.LuModule;
import com.thom.dto.LuProject;
import com.thom.mapper.LuGroupMapper;
import com.thom.mapper.LuModuleMapper;
import com.thom.mapper.LuProjectMapper;
import com.thom.mapper.LuUserMapper;
import com.thom.service.ProjectService;
import com.thom.util.PageUtils;
import com.thom.vo.DataContext;
import com.thom.vo.ModuleAddVO;
import com.thom.vo.PagedResult;
import com.thom.vo.ProjectAddVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by ThinkPad on 2017/3/5.
 */
@Controller
public class ModuleController {

    private final Logger logger = LoggerFactory.getLogger(ModuleController.class);

    @Resource
    private LuProjectMapper luProjectMapper;

    @Resource
    private LuModuleMapper luModuleMapper;

    @RequestMapping(value = "module/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("projects", luProjectMapper.queryProjects(""));
        mv.setViewName("views/module/module_add");

        return mv;
    }

    @RequestMapping(value = "module/do-add", method = RequestMethod.POST)
    @ResponseBody
    public DataContext<Object> doAdd(@Validated ModuleAddVO moduleAddVO, BindingResult result) {
        DataContext<Object> data = null;
        if (result.hasErrors()) {
            logger.error("请求参数非法{}", result.getAllErrors());

            data = new DataContext<>("9999", "请求参数非法");
        } else {
            LuModule luModule = new LuModule(moduleAddVO);

            if (luModuleMapper.insertModule(luModule) > 0) {
                data = new DataContext<>("0000", "新增成功");
            } else {
                data = new DataContext<>("9999", "新增失败");
            }
        }

        return data;
    }

}
