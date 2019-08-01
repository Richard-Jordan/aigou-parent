package cn.itsource;

import static org.junit.Assert.assertTrue;

import cn.itsource.domain.Brand;
import cn.itsource.mapper.BrandMapper;
import cn.itsource.query.BrandQuery;
import cn.itsource.service.IBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    private IBrandService brandService;


    @Test
    public void test(){
        List<Brand> list = brandService.list();
        for (Brand brand : list) {
            System.out.println(brand);
        }
    }
    @Test
    public void queryPage(){
        BrandQuery query = new BrandQuery();
        PageList<Brand> pageList = brandService.queryPage(query);
        System.out.println(pageList.getTotal());
        pageList.getRows().forEach(e->{
            System.out.println(e);
        });
    }
}
