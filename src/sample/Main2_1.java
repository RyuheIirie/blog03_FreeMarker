package sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.TemplateException;

public class Main2_1 {

	/**
	 * @param args
	 * @throws TemplateException 
	 * @throws IOException 
	 */
	public static void main(final String[] args) throws IOException, TemplateException {

		Map param = new HashMap();
		param.put("x", 2);
		param.put("check", true);

		List<SampleBean21> list = new ArrayList<SampleBean21>();
		list.add(new SampleBean21(1, "値1"));
		list.add(new SampleBean21(2, "値2"));
		param.put("sblist", list);

		SampleBean21 bean = new SampleBean21(99, "サンプル");
		param.put("SampleBean", bean);

		FtlUtil.execute("./src/sample/", "Part.2-1 if_list.ftl", param, System.out);
	}
}
