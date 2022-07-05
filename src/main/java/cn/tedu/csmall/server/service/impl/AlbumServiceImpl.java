package cn.tedu.csmall.server.service.impl;

import cn.tedu.csmall.server.mapper.AlbumMapper;
import cn.tedu.csmall.server.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.server.pojo.entity.Album;
import cn.tedu.csmall.server.repo.IAlbumRepository;
import cn.tedu.csmall.server.repo.impl.AlbumRepositoryImpl;
import cn.tedu.csmall.server.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AlbumServiceImpl implements IAlbumService {

    @Autowired
    public IAlbumRepository albumRepository;

    @Autowired
    AlbumMapper albumMapper;

    public AlbumServiceImpl() {
        System.out.println("AlbumServiceImpl的构造方法已经执行");
    }

    @Override
    public void addNew(AlbumAddNewDTO albumAddNewDTO){
        log.debug("准备开始处理增加品牌的业务，参数：{}", albumAddNewDTO);
        // 检查此品牌（尝试增加的品牌）的名称有没有被使用
        // 如果已经被使用，则不允许增加
        String name = albumAddNewDTO.getName();
        int count = albumMapper.countByName(name);
        if(count > 0){
            throw new RuntimeException("增加类别失败，类别名称【" + name + "】已经被占用！");
        }

        log.debug("开始处理增加相册的业务,参数:{}",albumAddNewDTO);
        Album album = new Album();
        BeanUtils.copyProperties(albumAddNewDTO, album);


        log.debug("即将向数据库中写入,数据 {}",album);
        albumMapper.insert(album);
    };

}
