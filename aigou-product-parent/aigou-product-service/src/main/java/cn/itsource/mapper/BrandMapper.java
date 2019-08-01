package cn.itsource.mapper;

import cn.itsource.domain.Brand;
import cn.itsource.query.BrandQuery;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author Tommy 
 * @since 2019-07-31
 */
public interface BrandMapper extends BaseMapper<Brand> {

    //分页查询


    IPage<Brand> queryPage(IPage<Brand> page, @Param("query") BrandQuery query);
}
