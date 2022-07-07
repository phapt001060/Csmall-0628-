package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.mapper.AlbumMapper;
import cn.tedu.csmall.server.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.pojo.entity.Brand;
import cn.tedu.csmall.server.repo.IAlbumRepository;
import cn.tedu.csmall.server.repo.impl.AlbumRepositoryImpl;
import cn.tedu.csmall.server.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 相册业务实现
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Slf4j
@Service
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    private IAlbumRepository albumRepository;
    @Autowired
    private AlbumMapper albumMapper;

    public AlbumServiceImpl() {
        log.debug("创建业务逻辑对象：AlbumServiceImpl");
    }

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO) {
        log.debug("开始处理创建相册的业务，参数：{}", albumAddNewDTO);
        // 检查此相册（尝试创建的相册）的名称有没有被使用
        // 如果已经被使用，则不允许创建
        String name = albumAddNewDTO.getName();
        int count = albumMapper.countByName(name);
        if (count > 0) {
            String message = "创建相册失败，相册名称【" + name + "】已经被占用！";
            log.error(message);
            throw new RuntimeException(message);
        }

        // 创建实体对象（Mapper的方法的参数是实体类型）
        Album album = new Album();

        // 将当前方法参数的值复制到Brand实体类型的对象中
        BeanUtils.copyProperties(albumAddNewDTO, album);
        // 补全属性值（不由客户端提交的属性的值，应该在插入之前补全）
        if (album.getSort() == null) {
            album.setSort(0);
        }

        // 将相册数据写入到数据库中
        log.debug("即将向表中写入数据：{}", album);
        albumMapper.insert(album);
    }

}
