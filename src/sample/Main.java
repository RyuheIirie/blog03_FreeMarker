package sample;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.TemplateException;

public class Main {

	/**
	 * @param args
	 * @throws TemplateException 
	 * @throws IOException 
	 */
	public static void main(final String[] args) throws IOException, TemplateException {

		Map param = new HashMap();
		param.put("str1", "aaa");
		param.put("usr", "USER1");
		FtlUtil.execute("./src/sample/", "Part.3-1 DataModel存在チェック.ftl", param, System.out);
	}
}
