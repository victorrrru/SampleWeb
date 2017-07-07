package cn.sample.domain.config.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CommDataConfig implements Serializable {
    /**
     * 主键id
     */
    private Short menuId;

    /**
     * 菜单类型（0：文化程度；1：单位性质）
     */
    private Byte menuType;

    /**
     * 菜单项
     */
    private String menuItem;

    private Short sort;

    /**
     * 对应的值
     */
    private Short value;

    /**
     * 创建时间
     */
    private Date createdon;

    private static final long serialVersionUID = 1L;

    public Short getMenuId() {
        return menuId;
    }

    public void setMenuId(Short menuId) {
        this.menuId = menuId;
    }

    public Byte getMenuType() {
        return menuType;
    }

    public void setMenuType(Byte menuType) {
        this.menuType = menuType;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public Short getValue() {
        return value;
    }

    public void setValue(Short value) {
        this.value = value;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}