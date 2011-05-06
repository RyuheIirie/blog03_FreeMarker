package part2_3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import sample.FtlUtil;
import freemarker.template.TemplateException;

public class Main2_3 {

	public static void main(final String[] args) throws IOException, TemplateException {

		Map param = new HashMap();
		FtlUtil.execute("./src/part2_3/", "Part.2-3.ftl", param, System.out);
	}
}
