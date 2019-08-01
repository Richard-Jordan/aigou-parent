package cn.itsource.web.controller;


import cn.itsource.AjaxResult;
import cn.itsource.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatServiceController {

   /* @RequestMapping("/login")*/
   @PostMapping("login")
    public AjaxResult main(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        if("admin".equals(username) && "admin".equals(password)){

            return AjaxResult.add().setSuccess(true).setMessage("登录成功").setRestObj(user);
        }
        return AjaxResult.add().setSuccess(false).setMessage("登录失败");

    }
}
