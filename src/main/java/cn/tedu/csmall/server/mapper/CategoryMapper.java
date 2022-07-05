package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Category;
import cn.tedu.csmall.server.pojo.vo.CategoryDetailVO;
import cn.tedu.csmall.server.pojo.vo.CategoryListItemVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类别Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface CategoryMapper {

    /**
     * 新增类别
     *
     * @param category 新增的类别对象
     * @return 受影响的行数
     */
    int insert(Category category);

    /**
     * 根据id删除类别
     *
     * @param id 被删除的类别的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个类别id，批量删除类别数据
     *
     * @param ids 期望删除的若干个类别数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

    /**
     * 统计类别的数量
     *
     * @return 类别的数量
     */
    int count();

    /**
     * 根据类别名称统计此名称对应的类别数据的数量
     *
     * @param name 类别名称
     * @return 此名称对应的类别数据的数量
     */
    int countByName(String name);

    /**
     * 根据id查询类别详情
     *
     * @param id 类别的id
     * @return 匹配的类别详情，如果没有匹配的数据，则返回null
     */
    CategoryDetailVO getById(Long id);

    /**
     * 根据父级类别的id查询类别列表
     *
     * @param parentId 父级类别的id
     * @return 类别列表
     */
    List<CategoryListItemVO> listByParentId(Long parentId);

}
