package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.pojo.entity.CategoryAttributeTemplate;
import cn.tedu.csmall.server.pojo.vo.BrandDetailVo;
import cn.tedu.csmall.server.pojo.vo.BrandListItemVO;
import cn.tedu.csmall.server.pojo.vo.CategoryAttributeTemplateDetailVO;
import cn.tedu.csmall.server.pojo.vo.CategoryAttributeTemplateListItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryAttributeTemplateMapper {

    /**
     * 插入品牌数据
     * @param
     * @return 受影响的行数，成功插入数据时，将返回1
     */
    int insert(CategoryAttributeTemplate categoryAttributeTemplate);

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
    CategoryAttributeTemplateDetailVO getById(Long id);


    /**
     * 查询品牌列表
     * @return 品牌列表的集合
     */
    List<CategoryAttributeTemplateListItemVO> list();
}
