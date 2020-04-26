package dd.dao;

import dd.mapper.Sku;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-01-31 10:50
 **/
 public interface SkuDao {

    List<Sku> findHkmk();

    void deleteId(Integer id);
}
