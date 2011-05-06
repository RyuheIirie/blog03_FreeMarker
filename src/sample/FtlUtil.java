package sample;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * ftl操作Utilクラス.
 */
public class FtlUtil {

	/**
	 * Templateとparamを突き合わせて結果を出力します。
	 * 
	 * @param templateDirName ftlファイルを配置しているディレクトリ名
	 * @param templateFileName ftlファイル名
	 * @param param ftl内で使用するパラメータ
	 * @param out FreeMarkerの出力先
	 * @throws IOException templateディレクトリ/ファイルが存在しない場合のエラー
	 * @throws TemplateException ftl実行時のエラー
	 */
	public static void execute(final String templateDirName, final String templateFileName,
			final Map param, final OutputStream out) throws IOException, TemplateException {

		// create configuration
		Configuration cfg = new Configuration();
		cfg.setDirectoryForTemplateLoading(new File(templateDirName));

		// get template
		Template temp = cfg.getTemplate(templateFileName);

		// execute
		temp.process(param, new OutputStreamWriter(out));
		// temp.process(new SampleBean(), new OutputStreamWriter(out));

		// flush out
		out.flush();
	}
}
