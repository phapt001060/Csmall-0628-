package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.vo.AlbumDetailVO;
import cn.tedu.csmall.server.pojo.vo.AlbumListItemVO;
import cn.tedu.csmall.server.pojo.vo.BrandDetailVo;
import cn.tedu.csmall.server.pojo.vo.BrandListItemVO;
import org.apache.ibatis.annotations.Param;

import java.lang.annotation.Retention;
import java.util.List;


public interface AlbumMapper {
    /**
     *
     * @param album
     * @return
     */
    int insert (Album album);

    /**
     * 根据品牌id,删除品牌数据
     * @param id 期望删除的品牌数据的id
     * @return 受影响的行数,当删除成功时返回1,如果没有此id返回0
     */
    int deleteById(Long id);

    /**
     * 根据id修改品牌的名称
     * @param id
     * @param name
     * @return
     */
    int updateNameById(@Param("id") Long id,@Param("name") String name);

    /**
     * 根据若干个品牌id，批量删除品牌数据
     * @param ids 期望删除的若干个品牌数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     *
     * @return
     */
    int count();

    /**
     *
     * @param id
     * @return
     */
    AlbumDetailVO getById(Long id);

    /**
     * 查询品牌列表
     * @return 品牌列表的集合
     */
    List<AlbumListItemVO> list();


}
