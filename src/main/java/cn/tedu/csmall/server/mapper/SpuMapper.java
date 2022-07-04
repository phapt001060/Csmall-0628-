package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Spu;
import cn.tedu.csmall.server.pojo.vo.SpuDetailTwoListItemVO;
import cn.tedu.csmall.server.pojo.vo.SpuDetailTwoVO;
import cn.tedu.csmall.server.pojo.vo.SpuDetailVO;
import cn.tedu.csmall.server.pojo.vo.SpuListItemVO;

import java.util.List;

public interface SpuMapper {
    /**
     *
     * @param spu
     * @return
     */
    int insert(Spu spu);

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
    SpuDetailVO getById(Long id);


    /**
     * 查询品牌列表
     * @return 品牌列表的集合
     */
    List<SpuListItemVO> list();
}
