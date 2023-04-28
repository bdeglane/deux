provider "docker" {}

resource "docker_image" "nginx" {
  name         = "nginx"
  keep_locally = false
}

resource "docker_container" "nginx" {
  count = 3
  image = docker_image.nginx.image_id
  name  = "nginx-${var.container_name_nginx}-${count.index}"

  ports {
    internal = 8000
    external = 8000 + count.index
  }
}

resource "random_pet" "dog" {
  length = 2
}

#module "reservation" {
#  source = "../modules/domains/reservation/infra"
#
#  container_name = "hello-${random_pet.dog.id}"
#  nginx_port = 8001
#
#  secret_key = var.secret_key
#}

