package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import cn.tedu.csmall.server.pojo.entity.Spu;
import cn.tedu.csmall.server.pojo.vo.PictureDetailVO;
import cn.tedu.csmall.server.pojo.vo.PictureListItemVO;
import cn.tedu.csmall.server.pojo.vo.SkuDetailVO;
import cn.tedu.csmall.server.pojo.vo.SkuListVO;

import java.util.List;

public interface SkuMapper {
    /**
     *
     * @param
     * @return
     */
    int insert(Sku sku);

    /**
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     *
     * @param id
     * @return
     */
    int updateNameById(Long id);

    /**
     *
     * @param ids
     * @return
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
    SkuDetailVO getById(Long id);


    /**
     * 查询品牌列表
     * @return 品牌列表的集合
     */
    List<SkuListVO> list();
}
