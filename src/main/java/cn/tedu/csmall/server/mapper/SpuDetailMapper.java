package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.SpuDetail;
import org.springframework.stereotype.Repository;

/**
 * SPU详情Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface SpuDetailMapper {

    /**
     * 新增SPU详情
     *
     * @param spuDetail 新增的SPU详情对象
     * @return 受影响的行数
     */
    int insert(SpuDetail spuDetail);

    /**
     * 根据id删除SPU详情
     *
     * @param id 被删除的SPU详情的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个SPU详情id，批量删除SPU详情数据
     *
     * @param ids 期望删除的若干个SPU详情数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}
