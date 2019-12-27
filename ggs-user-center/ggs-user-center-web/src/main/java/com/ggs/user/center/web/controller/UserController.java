package com.ggs.user.center.web.controller;


@RestController
@RequestMapping("/v1/userApi")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/list")
    public ResultEntity list(@RequestBody UserKey key){
        PageInfo<User> pageInfo = userService.selectListByPage(CommonUtil.copyProperties(key, User.class), CommonUtil.getPageable(key));
        PageInfoVo<UserVo> pageInfoVo = CommonUtil.pageInfo2Vo(pageInfo, user -> CommonUtil.copyProperties(user, UserVo.class));
        return ResultEntityUtil.success(pageInfoVo);
    }
}
