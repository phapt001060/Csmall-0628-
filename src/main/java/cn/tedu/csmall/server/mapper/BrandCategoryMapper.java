package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.BrandCategory;
import cn.tedu.csmall.server.pojo.vo.AttributeDetailVO;
import cn.tedu.csmall.server.pojo.vo.AttributeListItemVO;
import cn.tedu.csmall.server.pojo.vo.BrandCategoryDetailVO;
import cn.tedu.csmall.server.pojo.vo.BrandCategoryListItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandCategoryMapper {
    /**
     *
     * @param
     * @return
     */
    int insert(BrandCategory brandCategory);

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
    int updateNameById(@Param("id") Long id, @Param("name") String name);

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
    BrandCategoryDetailVO getById(Long id);


    /**
     * 查询品牌列表
     * @return 品牌列表的集合
     */
    List<BrandCategoryListItemVO> list();
}
