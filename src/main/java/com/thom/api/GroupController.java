package com.thom.api;

import com.github.pagehelper.PageHelper;
import com.thom.dto.LuGroup;
import com.thom.mapper.LuGroupMapper;
import com.thom.mapper.LuUserMapper;
import com.thom.service.GroupService;
import com.thom.util.PageUtils;
import com.thom.vo.DataContext;
import com.thom.vo.GroupAddVO;
import com.thom.vo.PagedResult;
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
public class GroupController {
    private final Logger logger = LoggerFactory.getLogger(GroupController.class);
    @Resource
    private LuUserMapper luUserMapper;

    @Resource
    private GroupService groupService;

    @Resource
    private LuGroupMapper luGroupMapper;

    @RequestMapping(value = "group/list", method = RequestMethod.GET)
    public String list() {
        return "views/group/group_list";
    }

    @RequestMapping(value = "group/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("users", luUserMapper.findUsersShort());
        mv.setViewName("views/group/group_add");
        return mv;
    }

    @RequestMapping(value = "group/do-add", method = RequestMethod.POST)
    @ResponseBody
    public DataContext<Object> doAdd(@Validated GroupAddVO groupAddVO, BindingResult result) {
        DataContext<Object> data = null;
        if (result.hasErrors()) {
            logger.error("请求参数非法{}", result.getAllErrors());

            data = new DataContext<>("9999", "请求参数非法");
        } else {
            LuGroup luGroup = new LuGroup(groupAddVO);

            boolean isSuccess = groupService.insertGroup(luGroup, groupAddVO.getMembers());
            if (isSuccess) {
                data = new DataContext<>("0000", "新增成功");
            } else {
                data = new DataContext<>("9999", "新增失败");
            }
        }

        return data;
    }


    @RequestMapping(value = "group/group-list", method = RequestMethod.GET)
    @ResponseBody
    public PagedResult<LuGroup> getGroups(String search, int offset, int limit) {
        PageHelper.startPage(offset, limit);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return PageUtils.toPagedResult(luGroupMapper.queryGroups(search));
    }
}
