package com.gizwits.noti.noticlient.bean.req.body;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.gizwits.noti.noticlient.bean.req.NotiGeneralCommandType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jcxcc
 * @since 1.0.0
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class SubscribeReqCommandBody extends AbstractCommandBody {

    public SubscribeReqCommandBody() {
        this.cmd = NotiGeneralCommandType.subscribe_req;
        this.data = new ArrayList<>();
    }

    /**
     * 登录信息
     */
    @JSONField(name = "data")
    private List<AuthorizationData> data;

    @Override
    String getJson() {
        return JSONObject.toJSONString(this, SerializerFeature.WriteEnumUsingName, SerializerFeature.IgnoreNonFieldGetter);
    }
}
