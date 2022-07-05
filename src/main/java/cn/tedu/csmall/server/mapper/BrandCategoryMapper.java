package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.BrandCategory;
import org.springframework.stereotype.Repository;

/**
 * 品牌类别关联Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface BrandCategoryMapper {

    /**
     * 新增品牌类别关联
     *
     * @param brandCategory 新增的品牌类别关联对象
     * @return 受影响的行数
     */
    int insert(BrandCategory brandCategory);

    /**
     * 根据id删除品牌类别关联
     *
     * @param id 被删除的品牌类别关联的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个品牌类别关联id，批量删除品牌类别关联数据
     *
     * @param ids 期望删除的若干个品牌类别关联数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}
