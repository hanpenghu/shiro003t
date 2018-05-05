import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlmap {
	private final static String f= File.separator;
	
    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		
		String ziDongShengChengConfigXmlPath=
				new StringBuffer(GeneratorSqlmap.class.getResource("/").getPath())
//				.append("com/main/resources").append(f)
				.append("mybatisNiXiangGongChengConfig.xml").toString( );

        File configFile = new File(ziDongShengChengConfigXmlPath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    } 
    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}