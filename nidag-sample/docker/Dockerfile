FROM centos:centos7

RUN export NDIAG_VERSION=0.13.2
RUN yum install -y https://github.com/k1LoW/ndiag/releases/download/v0.13.2/ndiag_0.13.2-1_amd64.rpm

RUN mkdir -p /home/ndiag/sample
RUN cd /home/ndiag/sample