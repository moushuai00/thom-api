package com.thom.api;

import com.thom.mapper.LuModuleMapper;
import com.thom.mapper.LuProjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ThinkPad on 2017/3/5.
 */
@Controller
public class ApiController {

    @Resource
    private LuProjectMapper luProjectMapper;

    @Resource
    private LuModuleMapper luModuleMapper;

    @RequestMapping(value="api/list", method = RequestMethod.GET)
    public String list() {
        return "views/view_api";
    }

    @RequestMapping(value="api/create", method = RequestMethod.GET)
    public ModelAndView create() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("projects", luProjectMapper.queryProjects(""));
        mv.addObject("modules", luModuleMapper.queryModules(""));
        mv.setViewName("views/api/api_add");

        return mv;
    }


    @RequestMapping(value="api/get-default-api-data", method = RequestMethod.GET)
    @ResponseBody
    public List getDefaultApiData() {
        List data = new ArrayList();

        Map<String, Object> item = new HashMap<String, Object>();

        item.put("name", "userName");
        item.put("account_id", "1");
        item.put("desc", "用户名称");
        item.put("type", "object");
        item.put("mockRule", "");
        item.put("level", 0);
        item.put("isLeaf", false);
        item.put("loaded", true);
        item.put("expanded", true);
        item.put("parent_id", null);
        item.put("className", "");
        data.add(item);

        return data;
    }
}
