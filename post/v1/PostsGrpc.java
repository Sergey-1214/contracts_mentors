package posts.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: post/v1/post.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PostsGrpc {

  private PostsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "posts.v1.Posts";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<posts.v1.PostOuterClass.CreatePostRequest,
      posts.v1.PostOuterClass.CreatePostResponse> getCreatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePost",
      requestType = posts.v1.PostOuterClass.CreatePostRequest.class,
      responseType = posts.v1.PostOuterClass.CreatePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<posts.v1.PostOuterClass.CreatePostRequest,
      posts.v1.PostOuterClass.CreatePostResponse> getCreatePostMethod() {
    io.grpc.MethodDescriptor<posts.v1.PostOuterClass.CreatePostRequest, posts.v1.PostOuterClass.CreatePostResponse> getCreatePostMethod;
    if ((getCreatePostMethod = PostsGrpc.getCreatePostMethod) == null) {
      synchronized (PostsGrpc.class) {
        if ((getCreatePostMethod = PostsGrpc.getCreatePostMethod) == null) {
          PostsGrpc.getCreatePostMethod = getCreatePostMethod =
              io.grpc.MethodDescriptor.<posts.v1.PostOuterClass.CreatePostRequest, posts.v1.PostOuterClass.CreatePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.CreatePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.CreatePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostsMethodDescriptorSupplier("CreatePost"))
              .build();
        }
      }
    }
    return getCreatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<posts.v1.PostOuterClass.GetPostRequest,
      posts.v1.PostOuterClass.GetPostResponse> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = posts.v1.PostOuterClass.GetPostRequest.class,
      responseType = posts.v1.PostOuterClass.GetPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<posts.v1.PostOuterClass.GetPostRequest,
      posts.v1.PostOuterClass.GetPostResponse> getGetPostMethod() {
    io.grpc.MethodDescriptor<posts.v1.PostOuterClass.GetPostRequest, posts.v1.PostOuterClass.GetPostResponse> getGetPostMethod;
    if ((getGetPostMethod = PostsGrpc.getGetPostMethod) == null) {
      synchronized (PostsGrpc.class) {
        if ((getGetPostMethod = PostsGrpc.getGetPostMethod) == null) {
          PostsGrpc.getGetPostMethod = getGetPostMethod =
              io.grpc.MethodDescriptor.<posts.v1.PostOuterClass.GetPostRequest, posts.v1.PostOuterClass.GetPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.GetPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.GetPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostsMethodDescriptorSupplier("GetPost"))
              .build();
        }
      }
    }
    return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<posts.v1.PostOuterClass.UpdatePostRequest,
      posts.v1.PostOuterClass.UpdatePostResponse> getUpdatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePost",
      requestType = posts.v1.PostOuterClass.UpdatePostRequest.class,
      responseType = posts.v1.PostOuterClass.UpdatePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<posts.v1.PostOuterClass.UpdatePostRequest,
      posts.v1.PostOuterClass.UpdatePostResponse> getUpdatePostMethod() {
    io.grpc.MethodDescriptor<posts.v1.PostOuterClass.UpdatePostRequest, posts.v1.PostOuterClass.UpdatePostResponse> getUpdatePostMethod;
    if ((getUpdatePostMethod = PostsGrpc.getUpdatePostMethod) == null) {
      synchronized (PostsGrpc.class) {
        if ((getUpdatePostMethod = PostsGrpc.getUpdatePostMethod) == null) {
          PostsGrpc.getUpdatePostMethod = getUpdatePostMethod =
              io.grpc.MethodDescriptor.<posts.v1.PostOuterClass.UpdatePostRequest, posts.v1.PostOuterClass.UpdatePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.UpdatePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.UpdatePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostsMethodDescriptorSupplier("UpdatePost"))
              .build();
        }
      }
    }
    return getUpdatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<posts.v1.PostOuterClass.DeletePostRequest,
      posts.v1.PostOuterClass.DeletePostResponse> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = posts.v1.PostOuterClass.DeletePostRequest.class,
      responseType = posts.v1.PostOuterClass.DeletePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<posts.v1.PostOuterClass.DeletePostRequest,
      posts.v1.PostOuterClass.DeletePostResponse> getDeletePostMethod() {
    io.grpc.MethodDescriptor<posts.v1.PostOuterClass.DeletePostRequest, posts.v1.PostOuterClass.DeletePostResponse> getDeletePostMethod;
    if ((getDeletePostMethod = PostsGrpc.getDeletePostMethod) == null) {
      synchronized (PostsGrpc.class) {
        if ((getDeletePostMethod = PostsGrpc.getDeletePostMethod) == null) {
          PostsGrpc.getDeletePostMethod = getDeletePostMethod =
              io.grpc.MethodDescriptor.<posts.v1.PostOuterClass.DeletePostRequest, posts.v1.PostOuterClass.DeletePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.DeletePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.DeletePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostsMethodDescriptorSupplier("DeletePost"))
              .build();
        }
      }
    }
    return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<posts.v1.PostOuterClass.RatePostRequest,
      posts.v1.PostOuterClass.RatePostResponse> getRatePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RatePost",
      requestType = posts.v1.PostOuterClass.RatePostRequest.class,
      responseType = posts.v1.PostOuterClass.RatePostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<posts.v1.PostOuterClass.RatePostRequest,
      posts.v1.PostOuterClass.RatePostResponse> getRatePostMethod() {
    io.grpc.MethodDescriptor<posts.v1.PostOuterClass.RatePostRequest, posts.v1.PostOuterClass.RatePostResponse> getRatePostMethod;
    if ((getRatePostMethod = PostsGrpc.getRatePostMethod) == null) {
      synchronized (PostsGrpc.class) {
        if ((getRatePostMethod = PostsGrpc.getRatePostMethod) == null) {
          PostsGrpc.getRatePostMethod = getRatePostMethod =
              io.grpc.MethodDescriptor.<posts.v1.PostOuterClass.RatePostRequest, posts.v1.PostOuterClass.RatePostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RatePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.RatePostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.RatePostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostsMethodDescriptorSupplier("RatePost"))
              .build();
        }
      }
    }
    return getRatePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<posts.v1.PostOuterClass.ListPostsRequest,
      posts.v1.PostOuterClass.ListPostsResponse> getListPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPosts",
      requestType = posts.v1.PostOuterClass.ListPostsRequest.class,
      responseType = posts.v1.PostOuterClass.ListPostsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<posts.v1.PostOuterClass.ListPostsRequest,
      posts.v1.PostOuterClass.ListPostsResponse> getListPostsMethod() {
    io.grpc.MethodDescriptor<posts.v1.PostOuterClass.ListPostsRequest, posts.v1.PostOuterClass.ListPostsResponse> getListPostsMethod;
    if ((getListPostsMethod = PostsGrpc.getListPostsMethod) == null) {
      synchronized (PostsGrpc.class) {
        if ((getListPostsMethod = PostsGrpc.getListPostsMethod) == null) {
          PostsGrpc.getListPostsMethod = getListPostsMethod =
              io.grpc.MethodDescriptor.<posts.v1.PostOuterClass.ListPostsRequest, posts.v1.PostOuterClass.ListPostsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.ListPostsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  posts.v1.PostOuterClass.ListPostsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostsMethodDescriptorSupplier("ListPosts"))
              .build();
        }
      }
    }
    return getListPostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostsStub>() {
        @java.lang.Override
        public PostsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostsStub(channel, callOptions);
        }
      };
    return PostsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostsBlockingStub>() {
        @java.lang.Override
        public PostsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostsBlockingStub(channel, callOptions);
        }
      };
    return PostsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostsFutureStub>() {
        @java.lang.Override
        public PostsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostsFutureStub(channel, callOptions);
        }
      };
    return PostsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CRUD
     * </pre>
     */
    default void createPost(posts.v1.PostOuterClass.CreatePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.CreatePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePostMethod(), responseObserver);
    }

    /**
     */
    default void getPost(posts.v1.PostOuterClass.GetPostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.GetPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    default void updatePost(posts.v1.PostOuterClass.UpdatePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.UpdatePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePostMethod(), responseObserver);
    }

    /**
     */
    default void deletePost(posts.v1.PostOuterClass.DeletePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.DeletePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    default void ratePost(posts.v1.PostOuterClass.RatePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.RatePostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRatePostMethod(), responseObserver);
    }

    /**
     * <pre>
     * Listing
     * </pre>
     */
    default void listPosts(posts.v1.PostOuterClass.ListPostsRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.ListPostsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPostsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Posts.
   */
  public static abstract class PostsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PostsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Posts.
   */
  public static final class PostsStub
      extends io.grpc.stub.AbstractAsyncStub<PostsStub> {
    private PostsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostsStub(channel, callOptions);
    }

    /**
     * <pre>
     * CRUD
     * </pre>
     */
    public void createPost(posts.v1.PostOuterClass.CreatePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.CreatePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPost(posts.v1.PostOuterClass.GetPostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.GetPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePost(posts.v1.PostOuterClass.UpdatePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.UpdatePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(posts.v1.PostOuterClass.DeletePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.DeletePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ratePost(posts.v1.PostOuterClass.RatePostRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.RatePostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRatePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Listing
     * </pre>
     */
    public void listPosts(posts.v1.PostOuterClass.ListPostsRequest request,
        io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.ListPostsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Posts.
   */
  public static final class PostsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PostsBlockingStub> {
    private PostsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CRUD
     * </pre>
     */
    public posts.v1.PostOuterClass.CreatePostResponse createPost(posts.v1.PostOuterClass.CreatePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public posts.v1.PostOuterClass.GetPostResponse getPost(posts.v1.PostOuterClass.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public posts.v1.PostOuterClass.UpdatePostResponse updatePost(posts.v1.PostOuterClass.UpdatePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public posts.v1.PostOuterClass.DeletePostResponse deletePost(posts.v1.PostOuterClass.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public posts.v1.PostOuterClass.RatePostResponse ratePost(posts.v1.PostOuterClass.RatePostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRatePostMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Listing
     * </pre>
     */
    public posts.v1.PostOuterClass.ListPostsResponse listPosts(posts.v1.PostOuterClass.ListPostsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Posts.
   */
  public static final class PostsFutureStub
      extends io.grpc.stub.AbstractFutureStub<PostsFutureStub> {
    private PostsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CRUD
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<posts.v1.PostOuterClass.CreatePostResponse> createPost(
        posts.v1.PostOuterClass.CreatePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<posts.v1.PostOuterClass.GetPostResponse> getPost(
        posts.v1.PostOuterClass.GetPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<posts.v1.PostOuterClass.UpdatePostResponse> updatePost(
        posts.v1.PostOuterClass.UpdatePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<posts.v1.PostOuterClass.DeletePostResponse> deletePost(
        posts.v1.PostOuterClass.DeletePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<posts.v1.PostOuterClass.RatePostResponse> ratePost(
        posts.v1.PostOuterClass.RatePostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRatePostMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Listing
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<posts.v1.PostOuterClass.ListPostsResponse> listPosts(
        posts.v1.PostOuterClass.ListPostsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPostsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POST = 0;
  private static final int METHODID_GET_POST = 1;
  private static final int METHODID_UPDATE_POST = 2;
  private static final int METHODID_DELETE_POST = 3;
  private static final int METHODID_RATE_POST = 4;
  private static final int METHODID_LIST_POSTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POST:
          serviceImpl.createPost((posts.v1.PostOuterClass.CreatePostRequest) request,
              (io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.CreatePostResponse>) responseObserver);
          break;
        case METHODID_GET_POST:
          serviceImpl.getPost((posts.v1.PostOuterClass.GetPostRequest) request,
              (io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.GetPostResponse>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((posts.v1.PostOuterClass.UpdatePostRequest) request,
              (io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.UpdatePostResponse>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((posts.v1.PostOuterClass.DeletePostRequest) request,
              (io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.DeletePostResponse>) responseObserver);
          break;
        case METHODID_RATE_POST:
          serviceImpl.ratePost((posts.v1.PostOuterClass.RatePostRequest) request,
              (io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.RatePostResponse>) responseObserver);
          break;
        case METHODID_LIST_POSTS:
          serviceImpl.listPosts((posts.v1.PostOuterClass.ListPostsRequest) request,
              (io.grpc.stub.StreamObserver<posts.v1.PostOuterClass.ListPostsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              posts.v1.PostOuterClass.CreatePostRequest,
              posts.v1.PostOuterClass.CreatePostResponse>(
                service, METHODID_CREATE_POST)))
        .addMethod(
          getGetPostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              posts.v1.PostOuterClass.GetPostRequest,
              posts.v1.PostOuterClass.GetPostResponse>(
                service, METHODID_GET_POST)))
        .addMethod(
          getUpdatePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              posts.v1.PostOuterClass.UpdatePostRequest,
              posts.v1.PostOuterClass.UpdatePostResponse>(
                service, METHODID_UPDATE_POST)))
        .addMethod(
          getDeletePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              posts.v1.PostOuterClass.DeletePostRequest,
              posts.v1.PostOuterClass.DeletePostResponse>(
                service, METHODID_DELETE_POST)))
        .addMethod(
          getRatePostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              posts.v1.PostOuterClass.RatePostRequest,
              posts.v1.PostOuterClass.RatePostResponse>(
                service, METHODID_RATE_POST)))
        .addMethod(
          getListPostsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              posts.v1.PostOuterClass.ListPostsRequest,
              posts.v1.PostOuterClass.ListPostsResponse>(
                service, METHODID_LIST_POSTS)))
        .build();
  }

  private static abstract class PostsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return posts.v1.PostOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Posts");
    }
  }

  private static final class PostsFileDescriptorSupplier
      extends PostsBaseDescriptorSupplier {
    PostsFileDescriptorSupplier() {}
  }

  private static final class PostsMethodDescriptorSupplier
      extends PostsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PostsMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PostsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostsFileDescriptorSupplier())
              .addMethod(getCreatePostMethod())
              .addMethod(getGetPostMethod())
              .addMethod(getUpdatePostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getRatePostMethod())
              .addMethod(getListPostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
