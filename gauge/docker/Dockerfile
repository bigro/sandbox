FROM ubuntu

RUN apt-get update && apt-get install -y tzdata
# timezone setting
ENV TZ=Asia/Tokyo

RUN apt-get update && apt-get install -q -y \
    apt-transport-https \
    gnupg2 \
    ca-certificates \
    curl \
    unzip \
    npm \
    tzdata \
    ibgtk-3.0 \
    libgbm-dev \
    libnss3 \
    libatk-bridge2.0-0 \
    libasound2

# Install gauge
RUN curl -SsL https://downloads.gauge.org/stable | sh

# Install gauge plugins
RUN gauge install ts && \
    gauge install screenshot