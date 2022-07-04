package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.pojo.vo.BrandDetailVo;
import cn.tedu.csmall.server.pojo.vo.BrandListItemVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//加此注解只是让MapperTests的mapper不报错
public interface BrandMapper {

    /**
     * 插入品牌数据
     * @param brand 品牌数据
     * @return 受影响的行数，成功插入数据时，将返回1
     */
    int insert(Brand brand);

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
     *根据Id修改信息,传入的参数应该包括修改的字段值,保持为null的属性对应的字段将不会被修改 注意:必须封装ID值
     * @param brand 封装了新的值的对象
     * @return  受影响的行数，将返回成功删除的数据量 1 失败则是0
     */
    int updateById(Brand brand);

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
    BrandDetailVo getById(Long id);


    /**
     * 查询品牌列表
     * @return 品牌列表的集合
     */
    List<BrandListItemVO> list();

    /**
     *
     * @param offset
     * @param count
     * @return
     */
    List<BrandListItemVO> listPage(
            @Param("offset") Integer offset,@Param("count") Integer count
    );

    /**
     *
     * @param name
     * @return
     */
    BrandDetailVo getByName(String name);
}
