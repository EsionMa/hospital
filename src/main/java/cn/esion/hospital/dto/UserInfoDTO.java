package cn.esion.hospital.dto;

import cn.esion.hospital.entity.PowerAccount;
import cn.esion.hospital.entity.UserBasicInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YuJian95  clj9509@163.com
 * @date 2020/3/19
 */

@ApiModel(value = "UserInfoDTO", description = "用户信息封装对象")
@Data
public class UserInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("账号信息")
    private PowerAccount account;

    @ApiModelProperty("用户信息")
    private UserBasicInfo basicInfo;

}
