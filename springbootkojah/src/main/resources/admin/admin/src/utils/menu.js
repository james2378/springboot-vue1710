const menu = {
    list() {
        return [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"访客","menuJump":"列表","tableName":"fangke"}],"menu":"访客管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","访问统计"],"menu":"访客预约","menuJump":"列表","tableName":"fangkeyuyue"}],"menu":"访客预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"访客来访","menuJump":"列表","tableName":"fangkelaifang"}],"menu":"访客来访管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除","来访"],"menu":"访客预约","menuJump":"列表","tableName":"fangkeyuyue"}],"menu":"访客预约管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"访客来访","menuJump":"列表","tableName":"fangkelaifang"}],"menu":"访客来访管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"访客","tableName":"fangke"}]
    }
}
export default menu;
