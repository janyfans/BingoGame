<template>
  <div id="app">
    <el-container>
      <el-header class="my-header">Header</el-header>
      <el-container>
        <el-aside class="my-aside">
          <el-menu class="my-menu">
            <el-menu-item index="1">处理中心</el-menu-item>
            <el-menu-item index="2">我的工作台</el-menu-item>
            <el-menu-item index="3">订单管理</el-menu-item>
          </el-menu>
        </el-aside>
        <el-main>Main</el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style scoped>
.my-header {
  background-color: #B3C0D1;
  color: #333;
  height: 10vh;
}
.my-aside {
  background-color: #D3DCE6;
  color: #333;
  height: 90lvh;
  width: 200px !important;
}
.my-menu {
  
}
</style>