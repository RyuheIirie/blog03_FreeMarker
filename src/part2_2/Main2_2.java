package part2_2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import sample.FtlUtil;
import sample.SampleBean21;
import freemarker.template.TemplateException;

public class Main2_2 {

	public static void main(final String[] args) throws IOException, TemplateException {

		Map param = new HashMap();

		param.put("copyright", new SampleBean21(1, "aa"));
		// param.put("date", Calendar.getInstance().getTime());
		FtlUtil.execute("./src/part2_2/", "Part.2-2.ftl", param, System.out);
	}
}
