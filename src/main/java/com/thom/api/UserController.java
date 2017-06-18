package com.thom.api;

import com.thom.mapper.LuUserMapper;
import com.thom.dto.LuUser;
import com.thom.service.UserService;
import com.thom.vo.DataContext;
import com.thom.vo.RegisterVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by ThinkPad on 2017/4/15.
 */
@Controller
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private LuUserMapper luUserMapper;

    @RequestMapping(value = "user/do-register", method = RequestMethod.POST)
    @ResponseBody
    public DataContext<Object> doRegister(@Validated RegisterVO register, BindingResult result) {
        DataContext<Object> data;
        if (result.hasErrors()) {
            logger.error("请求参数非法{}", result.getAllErrors());

            data = new DataContext<>("9999", "请求参数非法");
        } else {
            LuUser luUser = new LuUser(register);
            int count = luUserMapper.insertUser(luUser);
            if (count > 0) {
                data = new DataContext<>("0000", "成功");
            } else {
                data = new DataContext<>("9999", "新增失败");
            }
        }

        return data;
    }
}
