package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Picture;
import org.springframework.stereotype.Repository;

/**
 * 图片Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface PictureMapper {

    /**
     * 新增图片
     *
     * @param picture 新增的图片对象
     * @return 受影响的行数
     */
    int insert(Picture picture);

    /**
     * 根据id删除图片
     *
     * @param id 被删除的图片的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个图片id，批量删除图片数据
     *
     * @param ids 期望删除的若干个图片数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}
