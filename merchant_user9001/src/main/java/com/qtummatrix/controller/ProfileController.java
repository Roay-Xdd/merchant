package com.qtummatrix.controller;

import com.qtummatrix.bean.F_Address;
import com.qtummatrix.bean.F_Member;
import com.qtummatrix.bean.MyResult;
import com.qtummatrix.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("pro")
public class ProfileController {

    @Resource
    private ProfileService profileService;

    /**
     * 通过手机号码查询个人信息
     * @param token 手机号码
     * @return 已测
     */
    @GetMapping("getBmMember")
    public Object getBmMember(String token){
        System.out.println(token);
        return  profileService.selectByPrimaryTel(token);

    }

    /**
     * 修改登录密码,支付密码
     * @param oldPassword
     * @param newPassword
     * @param token
     * @return 已测
     */
    @PostMapping("/updatePwd")
    public MyResult updatePwd(String oldPassword, String newPassword, String token){

        return profileService.updatePwd(oldPassword,newPassword,token);
    }
    @PostMapping("/updatePayPassword")
    public MyResult updatePayPassword(String oldPayPassword,String newPayPassword,String token){

        return profileService.updatePayPassword(oldPayPassword,newPayPassword,token);
    }

    /**
     * 通过手机号码查询收货地址
     * @param token
     * @return 已测
     */
    @GetMapping("/getAddress")
    public List<F_Address> getAddress(String token){

        return profileService.getAddress(token);
    }

    /**
     * 添加收货地址
     * @param address
     * @return  已测
     */
    @PostMapping("insertAddress")
    public MyResult insertAddress(F_Address address){
        address.setIsDeleted(0);
        address.setIsDefault(0);
        Integer result = profileService.insertAddress(address);
        if(result > 0){
            return new MyResult(200,"添加成功",result);
        }else {
            return new MyResult(666,"添加失败,参数为"+address,null);
        }
    }
  /*  @PostMapping("addAddress")
    public Integer addAddress(F_Address bmAddress){
        Integer addr = profileService.addAddress(bmAddress);
        System.err.println(addr);
        return addr;
    }*/

    /**
     * 删除收货地址
     * @param addid 收货地址id
     * @return 已测
     */
    @PostMapping("deleteAddress")
    public MyResult deleteAddress(Integer addid){
        Integer result = profileService.deleteAddress(addid);
        if(result > 0){
            return new MyResult(200,"删除成功",result);
        }else {
            return new MyResult(666,"删除失败,参数为：addid"+addid,null);
        }
    }

    /**
     * 修改收货地址
     * @param bmAddress 收货地址信息
     * @return  已测
     */
    @PostMapping("updateAddress")
    public MyResult updateAddress(F_Address bmAddress){
        Integer result = profileService.updateAddress(bmAddress);
        if(result > 0){
            return new MyResult(200,"修改成功",result);
        }else {
            return new MyResult(666,"修改失败,参数为：bmAddress"+bmAddress,null);
        }
    }


    /**
     * 查找商家默认收货地址
     * @param token
     * @return 已测
     */
    @GetMapping("findDefault")
    public MyResult findDefaultAddress(String token){
        List<F_Address> list = profileService.findDefaultAddress(token);
        if(list != null){
            return new MyResult(200,"查询成功",list);
        }else {
            return new MyResult(666,"查询失败,参数为"+token,null);
        }
    }

    /**
     * 修改默认收货地址
     * @param token
     * @param addId
     * @return
     */
    @PostMapping("updateDefault")
    public MyResult updateDefault(String token,Integer addId){
        Integer result = profileService.updateDefault(token,addId);
        if(result > 0){
            return new MyResult(200,"修改成功",result);
        }else {
            return new MyResult(666,"修改失败,手机号为"+token+"地址id"+addId,null);
        }
    }

}
