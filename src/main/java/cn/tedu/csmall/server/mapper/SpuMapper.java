package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Spu;
import org.springframework.stereotype.Repository;

/**
 * SPU（Standard Product Unit）Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface SpuMapper {

    /**
     * 新增SPU
     *
     * @param spu 新增的SPU对象
     * @return 受影响的行数
     */
    int insert(Spu spu);

    /**
     * 根据id删除SPU
     *
     * @param id 被删除的SPU的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个SPU id，批量删除SPU数据
     *
     * @param ids 期望删除的若干个SPU数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}
