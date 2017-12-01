package JDBCUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

public class MyConver implements Converter {

	@Override
	public Date convert(Class arg0, Object value) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		Date parse=null;
		try {
			parse=sdf.parse(value.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return parse;
	}

}
