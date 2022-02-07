<template>
  <div id="app">
    <img src="./assets/logo.png">
    <router-link to="/">首页</router-link>
    <router-link to="/baidu">百度</router-link>
    <router-link to="/about">关于我们</router-link>
    <Login></Login>
    <router-view/>
  </div>
</template>

<script>
import Login from '@/components/Login'
export default {
  name: 'App',
  components: {
    'Login': Login
  },
  data() {
    return {}
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
