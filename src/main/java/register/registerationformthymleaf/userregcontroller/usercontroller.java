package register.registerationformthymleaf.userregcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import register.registerationformthymleaf.model.user;
import register.registerationformthymleaf.repository.userrepo;

@Controller
public class usercontroller {

    @Autowired
    private userrepo userrepo;

  @GetMapping("")
    public String home(){
        return "index";
    }

@GetMapping("/register")
public String reg(Model Model){
 
   Model.addAttribute("user", new user());
    return "registration" ;
 }

 @PostMapping("/reg_process")
 public String process( user user){
  
    
    userrepo.save(user) ;

   return "regsuccess" ;
 }



    
}
