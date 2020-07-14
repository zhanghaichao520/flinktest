package datax;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By qiuzhi. Description: Date: 2020-07-13 Time: 11:21 AM
 *
 * @author zhanghaichao
 * @date 2020/07/13
 */
public class App {

    public static void main(String[] args) {
        Job job = new Job();

        Setting setting = new Setting();

        ErrorLimit errorLimit = new ErrorLimit();
        errorLimit.setPercentage(0.02D);
        errorLimit.setRecord(0);
        setting.setErrorLimit(errorLimit);

        Speed speed = new Speed();
        speed.setChannel(4);
        setting.setSpeed(speed);

        job.setSetting(setting);

        Content content = new Content();
        Reader reader = new Reader();
        reader.setName("oraclereader");
        Parameter parameter = new Parameter();
        parameter.setBatchSize(123);
        reader.setParameter(parameter);
        content.setReader(reader);

        List<Content> contents = new ArrayList<>();
        contents.add(content);
        job.setContent(contents);

        System.out.println(JSON.toJSONString(job));

    }
}
