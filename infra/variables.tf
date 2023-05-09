variable "container_name_nginx" {
  description = "Value of the name for docker container"
  type = string
  default = "ExampleName"
}

variable "secret_key" {
  type = string
  sensitive   = true
  description = "Secret key for reservation module"
}
