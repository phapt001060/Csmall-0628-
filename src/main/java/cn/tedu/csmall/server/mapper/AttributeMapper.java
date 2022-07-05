package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Attribute;
import org.springframework.stereotype.Repository;

/**
 * 属性Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface AttributeMapper {

    /**
     * 新增属性
     *
     * @param attribute 新增的属性对象
     * @return 受影响的行数
     */
    int insert(Attribute attribute);

    /**
     * 根据id删除属性
     *
     * @param id 被删除的属性的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个属性id，批量删除属性数据
     *
     * @param ids 期望删除的若干个属性数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}