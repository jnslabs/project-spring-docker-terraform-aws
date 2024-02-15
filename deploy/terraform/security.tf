
resource "aws_security_group" "contactbook_sg" {
  name        = "contactbook_sg"
  description = "contactbook security group"
  vpc_id      = aws_vpc.contactbook_vpc_1.id

  tags = {
    "Name" = "contactbook_sg"
  }
}

resource "aws_security_group_rule" "sgr_public_out" {
  type        = "egress"
  from_port   = 0
  to_port     = 0
  protocol    = "-1"
  cidr_blocks = ["0.0.0.0/0"]

  security_group_id = aws_security_group.contactbook_sg.id
}

resource "aws_security_group_rule" "srg_public_in_ssh" {
  type              = "ingress"
  from_port         = 22
  to_port           = 22
  protocol          = "tcp"
  cidr_blocks       = ["0.0.0.0/0"]
  security_group_id = aws_security_group.contactbook_sg.id
}

resource "aws_security_group_rule" "public_in_http" {
  type              = "ingress"
  from_port         = 80
  to_port           = 80
  protocol          = "tcp"
  cidr_blocks       = ["0.0.0.0/0"]
  security_group_id = aws_security_group.contactbook_sg.id
}

resource "aws_key_pair" "contactbook_key" {
  key_name   = "contactbook_key"
  public_key = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC3+TGEp23oQ3BGToNQPoKSboxo4Mhzk9aJ596TQCWx3DQ3/Dmf2GxjscewJYvg9ERBwdjHclUA6CS6DTvyUWUWO7t2neyRceeo9X4E94cKgevrMVCaTqxZGZYxUaCzMDC/VFo8UuoqxZu5TFD9sIhFe2XMjaX3jyku2/gr7hRLm7EEhbW8ESWCvt8vrjOljtHEK7PxWXoIHU7lZEdKtifTN5sgU4TxfwJJrHmp0Lc3f64LRuUamZYKNFxHi86du68ET6k2k8ptMlKhPAb92KlKFyWSE5m1YQTsBs3ykUe3UFTefQPEDRLtqr0Riumtd8QQlBK0weCsjlYvU5ZEu2dY+kE9Ks4Sa1FRa2ZfzjP9Yr/n8m4vqGO5igyQRtnWo/MldqKwcBY9sotyeRQmvxHJ/n+5nKD1XRMx9C4i8GmZBt9COYyA1VQTh8nOT8NABbJLlVg1KJhzcYfpk46P0hPQLWLY/inx6WQlwT3u7a4c77NHvNTLXseSEo04k2ETLEs= jnsou@DESKTOP-VOFIDN8"
}
