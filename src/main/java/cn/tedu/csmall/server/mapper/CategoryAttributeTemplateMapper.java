package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.CategoryAttributeTemplate;
import org.springframework.stereotype.Repository;

/**
 * 类别与属性模板关联Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface CategoryAttributeTemplateMapper {

    /**
     * 新增类别与属性模板关联
     *
     * @param categoryAttributeTemplate 新增的类别与属性模板关联对象
     * @return 受影响的行数
     */
    int insert(CategoryAttributeTemplate categoryAttributeTemplate);

    /**
     * 根据id删除类别与属性模板关联
     *
     * @param id 被删除的类别与属性模板关联的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个类别与属性模板关联数据id，批量删除类别与属性模板关联数据
     *
     * @param ids 期望删除的若干个类别与属性模板关联数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}
