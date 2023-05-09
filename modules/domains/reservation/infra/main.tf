resource "docker_image" "nginx" {
  name         = "nginx"
  keep_locally = false
}

resource "docker_container" "nginx" {
  count = 1
  image = docker_image.nginx.latest
  name  = var.container_name
  ports {
    internal = 80
    external = var.nginx_port
  }
}
