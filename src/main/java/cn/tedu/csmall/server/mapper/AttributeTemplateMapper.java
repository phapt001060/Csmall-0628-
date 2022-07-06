package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.AttributeTemplate;
import org.springframework.stereotype.Repository;

/**
 * 属性模板Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface AttributeTemplateMapper {

    /**
     * 新增属性模板
     *
     * @param attributeTemplate 新增的属性模板对象
     * @return 受影响的行数
     */
    int insert(AttributeTemplate attributeTemplate);

    /**
     * 根据id删除属性模板
     *
     * @param id 被删除的属性模板的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个属性模板id，批量删除属性模板数据
     *
     * @param ids 期望删除的若干个属性模板数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     * 根据属性模板名称统计此名称对应的属性模板数据的数量
     *
     * @param name 属性模板名称
     * @return 此名称对应的属性模板数据的数量
     */
    int countByName(String name);

}
