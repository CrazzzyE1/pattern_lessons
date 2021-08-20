package com.company.hw7;

@Controller
@RequestMapping("/")
public class IndexController {
    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getIndexPage() {
        return "pages/index";
    }
}
