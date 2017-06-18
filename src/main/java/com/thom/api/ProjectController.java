package com.thom.api;

import com.github.pagehelper.PageHelper;
import com.thom.dto.LuGroup;
import com.thom.dto.LuProject;
import com.thom.mapper.LuGroupMapper;
import com.thom.mapper.LuProjectMapper;
import com.thom.mapper.LuUserMapper;
import com.thom.service.ProjectService;
import com.thom.util.PageUtils;
import com.thom.vo.DataContext;
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
public class ProjectController {

    private final Logger logger = LoggerFactory.getLogger(ProjectController.class);

    @Resource
    private LuGroupMapper luGroupMapper;

    @Resource
    private LuUserMapper luUserMapper;

    @Resource
    private ProjectService projectService;

    @Resource
    private LuProjectMapper luProjectMapper;

    @RequestMapping(value = "project/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("groups", luGroupMapper.queryGroups(""));
        mv.addObject("users", luUserMapper.findUsersShort());
        mv.setViewName("views/project/project_add");

        return mv;
    }

    @RequestMapping(value = "project/list", method = RequestMethod.GET)
    public String list() {
        return "views/project/project_list";
    }

    @RequestMapping(value = "project/do-add", method = RequestMethod.POST)
    @ResponseBody
    public DataContext<Object> doAdd(@Validated ProjectAddVO projectAddVO, BindingResult result) {
        DataContext<Object> data = null;
        if (result.hasErrors()) {
            logger.error("请求参数非法{}", result.getAllErrors());

            data = new DataContext<>("9999", "请求参数非法");
        } else {
            LuProject luProject = new LuProject(projectAddVO);

            if (projectService.insertProject(luProject, projectAddVO.getMembers())) {
                data = new DataContext<>("0000", "新增成功");
            } else {
                data = new DataContext<>("9999", "新增失败");
            }
        }

        return data;
    }

    @RequestMapping(value = "project/project-list", method = RequestMethod.GET)
    @ResponseBody
    public PagedResult<LuProject> getGroups(String search, int offset, int limit) {
        PageHelper.startPage(offset, limit);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return PageUtils.toPagedResult(luProjectMapper.queryProjects(search));
    }
}
