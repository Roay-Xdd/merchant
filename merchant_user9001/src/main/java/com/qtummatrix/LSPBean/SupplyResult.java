package com.qtummatrix.LSPBean;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述：sjy自定义相应类型
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/7 11:26
 */
@Component
public class SupplyResult {

    /**
     * 方法描述: 自定义响应jackson对象
     * @Author: Shi JiuYue
     * @Date 11:27 2020/7/7
     **/
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 方法描述: 自定义响应状态
     * @Author: Shi JiuYue
     * @Date 11:28 2020/7/7
     **/
    private Integer status;

    /**
     * 方法描述: 响应中的消息
     * @Author: Shi JiuYue
     * @Date 11:29 2020/7/7
     **/
    private String msg;

    /**
     * 方法描述: 响应中的数据
     * @Author: Shi JiuYue
     * @Date 11:31 2020/7/7
     **/
    private Object data;



    public static SupplyResult build(Integer status, String msg, Object data) {
        return new SupplyResult(status, msg, data);
    }

    public static SupplyResult ok(Object data) {
        return new SupplyResult(data);
    }

    public static SupplyResult ok() {
        return new SupplyResult(null);
    }

    public SupplyResult() {

    }

    public static SupplyResult build(Integer status, String msg) {
        return new SupplyResult(status, msg, null);
    }

    public SupplyResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public SupplyResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 方法描述: 将json结果集转化为SupplyResult
     * @Author: Shi JiuYue
     * @Date 11:50 2020/7/7
     **/
    public static SupplyResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, SupplyResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 方法描述: 没有Object对象的转化
     * @Author: Shi JiuYue
     * @Date 11:50 2020/7/7
     **/
    public static SupplyResult format(String json) {
        try {
            return MAPPER.readValue(json, SupplyResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方法描述: Object集合转化
     * @Author: Shi JiuYue
     * @Date 11:51 2020/7/7
     **/
    public static SupplyResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
}
