const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋类型","menuJump":"列表","tableName":"fangwuleixing"}],"menu":"房屋类型管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"buttons":["查看","修改","删除","审核","签约"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"在线签约","menuJump":"列表","tableName":"zaixianqianyue"}],"menu":"在线签约管理"},{"child":[{"buttons":["查看","修改","删除","审核","报表"],"menu":"租赁评价","menuJump":"列表","tableName":"zulinpingjia"}],"menu":"租赁评价管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"buttons":["查看","审核","支付","评价"],"menu":"在线签约","menuJump":"列表","tableName":"zaixianqianyue"}],"menu":"在线签约管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"租赁评价","menuJump":"列表","tableName":"zulinpingjia"}],"menu":"租赁评价管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;
