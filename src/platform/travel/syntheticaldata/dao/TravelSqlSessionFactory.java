package platform.travel.syntheticaldata.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TravelSqlSessionFactory {

	private static TravelSqlSessionFactory instance = null;
	private static SqlSessionFactory sqlSessionFactory = null;

	private TravelSqlSessionFactory() throws IOException {
		String resource = "SqlMappingConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public static TravelSqlSessionFactory Instance() throws IOException {
		if (null == instance) {
			instance = new TravelSqlSessionFactory();
		}
		return instance;
	}

	public SqlSession getSqlSession() throws IOException {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		return sqlSession;
	}
	
}
