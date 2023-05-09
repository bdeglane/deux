variable "container_name" {
  type = string
  description = "NGINX container's name"
}

variable "nginx_port" {
  type = number
  description = "NGINX container's external port number"
}

variable "secret_key" {
  type = string
  sensitive   = true
  description = "Secret key for reservation module"
}
