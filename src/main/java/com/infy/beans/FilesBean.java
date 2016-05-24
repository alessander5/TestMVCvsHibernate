package com.infy.beans;

import com.infy.domein.FileInfo;
import com.infy.service.IFileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Infy on 23.05.2016.
 */
@ManagedBean(name = "filesBean")
@SessionScoped
@Controller
public class FilesBean implements Serializable{

    @Autowired
    private IFileInfoService fileService;

    Collection<FileInfo> filesInfo;

    {
        filesInfo = fileService.getList();
    }

    public Collection<FileInfo> getFilesInfo() {
        return filesInfo;
    }

    public void setFilesInfo(Collection<FileInfo> filesInfo) {
        this.filesInfo = filesInfo;
    }
}
