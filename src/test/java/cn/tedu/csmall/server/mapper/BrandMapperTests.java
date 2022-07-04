package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.pojo.vo.BrandDetailVo;
import cn.tedu.csmall.server.pojo.vo.BrandListItemVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class BrandMapperTests {

    @Autowired
    BrandMapper mapper;

    @Test
    public void testInsert() {
        Brand brand = new Brand();
        brand.setName("iwatch");
        brand.setPinyin("shoubiao");
        System.out.println("测试添加之间"+brand);
        int rows = mapper.insert(brand);
        System.out.println("rows="+rows);
        System.out.println("测试添加之后"+brand);
    }

    @Test
    public void testDeleteById(){
        Long id = 1L;
        int rows = mapper.deleteById(id);
        System.out.println("删除完成,收影响行数="+rows);
    }

    @Test
    public void testUpdateNameById(){
        Long id = 2L;
        String name = "123";
        int rows = mapper.updateNameById(id,name);
        System.out.println("修改完成受影响行数"+rows);
    }

    @Test
    public void testDeleteByIds() {
        int rows = mapper.deleteByIds(2L, 3L, 5L, 7L, 9L);
        System.out.println("批量删除完成，受影响的行数=" + rows);
    }

    @Test
    public void updateById(){
        Long id = 6L;
        String name = "Iphone 18";
        String logo = "www.apple.com";
        String pinyin = "aifeng";
        String description = "品牌简介";
        Brand brand = new Brand();
        brand.setDescription(description);
        brand.setId(id);
        brand.setName(name);
        brand.setLogo(logo);
        brand.setPinyin(pinyin);

        int rows = mapper.updateById(brand);
        System.out.println("修改品牌信息完成，受影响的行数=" + rows);
    }

    @Test
    public void testCount(){
      int count =  mapper.count();
        System.out.println("查询结果"+count);
    }

    @Test
    public void testSelect(){
        Long id = 6L;
        BrandDetailVo brandDetailVo = mapper.getById(id);
        System.out.println("根据id="+id+"查询完成:"+brandDetailVo);
    }

    @Test
    public void testList() {
        List<BrandListItemVO> list = mapper.list();
        System.out.println("查询列表完成，结果集中的数据的数量=" + list.size());
        for (BrandListItemVO item : list) {
            System.out.println(item);
        }
    }

    @Test
    public void testListPage(){
       Integer offset = 3;
       Integer count = 1;
        List<BrandListItemVO> list = mapper.listPage(offset,count);
       log.info("查询列表完成，结果集中的数据的数量= {}" ,list.size());
       for (BrandListItemVO item : list) {
           log.info("{}" ,item);
       }
    }

    @Test
    public void testGetByName() {
        String name = "华为";
        BrandDetailVo brandDetailVo = mapper.getByName(name);
        log.info("根据名字= {}查询完成,结果 {}",name,brandDetailVo);
    }
}
